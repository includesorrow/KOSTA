package kr.or.kosta.mvc.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.ExcelVO;


@Repository
public class LoadPoiDao {
	
	private LoadPoiDao poi;
	
	public List<Map<String,Object>> readExsel(String fileName) throws IOException {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		
		//���������� �ִ� ��ε� Ȯ���ؼ� �����ؾ���
		String path = "C:\\bigdataStudy\\webapp\\spring\\spring_MVC\\WebContent\\resources\\xls\\"+fileName;
		FileInputStream fis = new FileInputStream(path);
		// �׼������� ����
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		int rowindex = 0;
		int columnindex = 0;
		// ��Ʈ �� (ù��°���� �����ϹǷ� 0�� �ش�)
		// ���� �� ��Ʈ�� �б����ؼ��� FOR���� �ѹ��� �����ش�
		HSSFSheet sheet = workbook.getSheetAt(0);
		// ���� ��
		int rows = sheet.getPhysicalNumberOfRows();
		for (rowindex = 1; rowindex < rows; rowindex++) {
			ExcelVO vo = new ExcelVO();
			HashMap<String, Object> map2 = new HashMap<String, Object>();
		
			// ���� �д´�
			HSSFRow row = sheet.getRow(rowindex);
			if (row != null) {
				// ���� ��
				int cells = row.getPhysicalNumberOfCells();
				for (columnindex = 0; columnindex <= cells; columnindex++) {
					
					// ������ �д´�
					HSSFCell cell = row.getCell(columnindex);
//					if(cell != null) {
//					System.out.println("cell "+cell);
//					}
					String key= "";
					String value = "";
					String count="";
					// ���� ���ϰ�츦 ���� ��üũ
					if (cell == null) {
						continue;
					} else {
						// Ÿ�Ժ��� ���� �б�
						switch (cell.getCellType()) {
						case HSSFCell.CELL_TYPE_FORMULA:
							value = cell.getCellFormula();
							break;
						case HSSFCell.CELL_TYPE_NUMERIC:
							value = String.valueOf(cell.getNumericCellValue() + "");
							count = String.valueOf(cell.getNumericCellValue() + "");
							break;
						case HSSFCell.CELL_TYPE_STRING:
							
							value = cell.getStringCellValue() + "";
							break;
						case HSSFCell.CELL_TYPE_BLANK:
							value = cell.getBooleanCellValue() + "";
							break;
						case HSSFCell.CELL_TYPE_ERROR:
							value = cell.getErrorCellValue() + "";
							break;
						}
					}
					
					
					if (columnindex == 0) {
						vo.setKeyword(value);
						map2.put("keyword",value);
					
						
					} else {
						map2.put("count",count);
						
						if(columnindex == 1) {
							data.add(map2);
						}
					}
				
				}
			}
		}
		return data;
	}
	
	public void excelDataMerge() {
		  Map<String, Map<String, Object>> resultMap = new HashMap<String, Map<String, Object>>();
		  
		  //��ĥ ������ �ִ� ���
		  String folder="C:\\bigdataStudy\\webapp\\spring\\spring_MVC\\WebContent\\resources\\xls";
		  //���������� ���ϰ�ü ����
		  File file=new File(folder);

		  if(!file.isDirectory()){
		   System.out.println("�ش���丮�� �������� �ʽ��ϴ�");
		   System.exit(1);
		   
		  }
		  //������� ������ ���� ���ϰ�ü�� ����Ʈ�� �޴´�.
		  File[] list=file.listFiles();
		  LoadPoiDao poi = new LoadPoiDao();
		  List<Map<String,Object>> aa = null;
		  try {	//����� �ݺ��Ǿ�� ��
				for(int a=0; a<list.length; a++) {
				aa = poi.readExsel(list[a].getName());
					for(int i=0; i<aa.size(); i++){
						String orderNumber = aa.get(i).get("keyword").toString(); //KEY VALUE
						
						if(resultMap.containsKey(orderNumber)){
						
							//KEY���� �����ϸ� �ش� Ű���� �ش�Ǵ� ������ ������ ������
							resultMap.get(orderNumber).put("count", 
							  Integer.parseInt(resultMap.get(orderNumber).get("count").toString().replace(".0","")) 
							+ Integer.parseInt(aa.get(i).get("count").toString().replace(".0","")) );
					
						}else{
							//KEY���� �������� ������ MAP�� �����͸� �־���
							resultMap.put(orderNumber, aa.get(i));
							
						}
						
					}
				} 
			   	
				//������ ����Ǵ� ���
				String path="C:\\Users\\KOSTA\\Downloads\\TagDataExcel.csv";
				PrintWriter pw = null;
				
				try {
					pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))),true);
					StringBuffer sb = new StringBuffer();
					String cNameList=",";
					//����Ʈ
					sb.append(cNameList);
					sb.append("\n");
					
					//Ű�� ���� �����;�  �ϴµ� ����Ű�� get�� �ƴ� entry �� �̾Ƴ��� ���
					for (Entry<String, Map<String, Object>> entry : resultMap.entrySet()) {

			 	        String key = entry.getKey();
			 	        Object value = entry.getValue();
			 	        sb.append(key).append(",");
						sb.append(resultMap.get(key).get("count"));
						sb.append("\n");
					}

					pw.write(sb.toString());
					pw.close();
					System.out.println("������!");
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
		public static void main(String[] args) {
		
		LoadPoiDao poi = new LoadPoiDao();
		
		poi.excelDataMerge();
		
		
	}


}
