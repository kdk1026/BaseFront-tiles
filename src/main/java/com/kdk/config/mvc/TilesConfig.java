package com.kdk.config.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {

    @Bean
    TilesConfigurer tilesConfigurer() {
		final TilesConfigurer configurer = new TilesConfigurer();

		final String[] sDefinitions = {"/WEB-INF/tiles/tiles.xml"};
		configurer.setDefinitions(sDefinitions);

		configurer.setCheckRefresh(true);

		return configurer;
	}

    @Bean
    TilesViewResolver tilesViewResolver() {
		final TilesViewResolver tilesViewResolver = new TilesViewResolver();

		tilesViewResolver.setViewClass(TilesView.class);
		tilesViewResolver.setOrder(1);

		return tilesViewResolver;
	}

}
