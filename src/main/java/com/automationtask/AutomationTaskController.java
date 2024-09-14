package com.automationtask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationTaskController {
@GetMapping(value="/getAuto")
public String get() {
	return "hakuna mattata";
}
}
