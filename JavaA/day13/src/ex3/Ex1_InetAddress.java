/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 *
 * @author KOSTA
 */
public class Ex1_InetAddress implements Ex1_InetAddressInter{
    private InetAddress[] ar; // 서버가 도메인 여러개의 서비스를 가질 경우
    
    @Override
    public void searchDomain(String ns)throws UnknownHostException{
        ar = InetAddress.getAllByName(ns);
        
    }
    
    
    @Override
    public ArrayList<String> getDomainList(){
        ArrayList<String> list = new ArrayList<>();
        for(InetAddress e : ar){
            //InetAddress를 사용해서 호스트를 받아온다
            list.add(e.getHostAddress());
        }
        return list;
        
    }
    }
