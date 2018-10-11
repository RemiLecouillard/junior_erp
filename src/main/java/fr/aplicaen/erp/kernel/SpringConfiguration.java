package fr.aplicaen.erp.kernel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lecouillard on 18/05/18.
 */
@Configuration
@ComponentScan(basePackages = {"fr.aplicaen.erp.dao.impl", "fr.aplicaen.erp.controller"})
public class SpringConfiguration {

}
