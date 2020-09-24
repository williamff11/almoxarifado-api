package br.com.infnet.almoxarifado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.infnet.almoxarifado.controller"))
				.paths(PathSelectors.any()).build().useDefaultResponseMessages(false).apiInfo(apiInfo())
				.globalResponseMessage(RequestMethod.GET, this.responseMessages())
				.globalResponseMessage(RequestMethod.POST, this.responseMessages())
				.globalResponseMessage(RequestMethod.PUT, this.responseMessages())
				.globalResponseMessage(RequestMethod.DELETE, this.responseMessages());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Almoxarifador").description("O Facilitador Web de Almoxarifados")
				.version("1.0.0").contact(new Contact("William Felicio Freire", "https://github.com/williamff11",
						"william.freire@al.infnet.edu.br"))
				.build();
	}

	@SuppressWarnings("serial")
	private List<ResponseMessage> responseMessages() {
		ArrayList<ResponseMessage> statusCodes = new ArrayList<ResponseMessage>();

		statusCodes.add(new ResponseMessageBuilder().code(200).message("Sucesso").build());
		statusCodes.add(new ResponseMessageBuilder().code(400).message("Erro na chamada da API").build());
		statusCodes.add(new ResponseMessageBuilder().code(500).message("Erro no Servidor").build());

		return statusCodes;
	}
}