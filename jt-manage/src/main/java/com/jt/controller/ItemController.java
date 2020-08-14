package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.service.ItemService;

/**
 * @author Ljz
 * @date   2020-08-14
 */
@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	
	
	
}
