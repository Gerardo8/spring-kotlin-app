package org.luger.app.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.config.annotation.CorsRegistry



/**
 * Created by gerardo8 on 02/12/2016.
 */

@Configuration
@EnableWebMvc
open class WebConfig : WebMvcConfigurerAdapter() {

    override
    fun addCorsMappings(registry: CorsRegistry?) {
        registry!!.addMapping("/api/**")
                .allowedOrigins("http://localhost:4200")
//                .allowedMethods("PUT", "DELETE")
//                .allowedHeaders("header1", "header2", "header3")
//                .exposedHeaders("header1", "header2")
//                .allowCredentials(false).maxAge(3600)
    }
}
