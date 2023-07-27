package com.controller;

import java.time.LocalDate;

import com.adaptor.HDFCAdapter;
import com.adaptor.ICICIAdapter;
import com.model.Transaction;

public class AdapterController {
	public static void main(String[] args) {
		Transaction t = new Transaction(1,"ACC3456","DFG6723",13000,LocalDate.now());
		
		ICICIAdapter icAdapter = new ICICIAdapter(t);
		System.out.println(icAdapter.convert());
		
		HDFCAdapter hdAdapter = new HDFCAdapter(t);
		System.out.println(hdAdapter.convert());
		
	}
}
