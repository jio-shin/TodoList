package com.multicampus.springex.sample;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository// DAO와 같은 객체를 위한 객체 표시
@Qualifier("Oracle")
public class SampleDAO_Oracle_Impl implements SampleDAO {


}
