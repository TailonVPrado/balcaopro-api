package br.com.maxyPiggy.balcao_pro.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Balcão PRO - API")
                        .description("API para vendas de materiais de construção: usuários, endereços, produtos, categorias, tabela de preços, orçamentos e itens.")
                        .version("v1")
                        .contact(new Contact().name("Equipe Balcão PRO").email("suporte@balcao.com"))
                        .license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0")))
                .servers(List.of(new Server().url("http://localhost:8080").description("Local")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentação complementar")
                        .url("https://example.com/docs"));
    }
}