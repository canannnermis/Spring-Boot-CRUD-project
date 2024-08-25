package com.crudornek.demo;

import com.crudornek.demo.data.tvdata;
import com.crudornek.demo.data.tvdatainterface;
import com.crudornek.demo.entities.TV;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);}
		@Bean
		@Autowired
		CommandLineRunner commondlineRunner (tvdatainterface tvdata)
		{
			return runner ->{
				//addTV(tvdata);
				//getTVById(tvdata);
				//deleteTVById(tvdata);
				updateTV(tvdata);
			};

	}

	private void updateTV(tvdatainterface tvdata) {
		TV tv =tvdata.getById(2);
		System.out.println(tv);

		tv.setKanaladi("kanalali");
		tvdata.updateTV(tv);
		System.out.println(tv);


	}

	private void deleteTVById(tvdatainterface tvdata) {
	int id=3;
	tvdata.deleteById(id);
		if (null == tvdata) {
            System.out.println("silinemedi");
        } else {
System.out.println("istenilen kanal silinmiştir");
}
    }



	private void getTVById(tvdatainterface tvdata) {
		int id =20;
		TV tv =tvdata.getById(id);
		if (tv== null)
			System.out.println("eklenmiş kanal bulunmamaktadır");
		else
			System.out.println(tv);}

    private void addTV(tvdatainterface tvdata) {
        TV tv =new TV (91,"kanalcanan","şlokuhtfrdtfghujılp");
        tvdata.add(tv);;
        System.out.println(tv);
    }
}

