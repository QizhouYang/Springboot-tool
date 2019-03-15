package com.yqz.test;

import java.io.InputStream;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.yqz.study.App;
import lombok.extern.slf4j.Slf4j;
import springfox.documentation.staticdocs.Swagger2MarkupResultHandler;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@Slf4j
@AutoConfigureMockMvc
@AutoConfigureRestDocs(outputDir = "target/generated-snippets")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestSwaggerStaticDoc {
	
	private String snippetDir = "target/generated-snippets";
	private String outputDir = "target/asciidoc";
	@Autowired
	private MockMvc mockMvc;
	
	/*static {
		StreamTool.checkFile(OUTPUT_DIR);
	}
	*/
	@Test
	public void createMsgFile() throws Exception {
		log.info("create json file");
		mockMvc.perform(get("/v2/api-docs").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andDo(Swagger2MarkupResultHandler.outputDirectory(outputDir).build())
			.andReturn();
		
		/*Swagger2MarkupConverter.from(outputDir + "/swagger.json")
			.withPathsGroupedBy(GroupBy.TAGS)
			.withMarkupLanguage(MarkupLanguage.ASCIIDOC)
			.withExamples(snippetDir)
			.build()
			.intoFolder(outputDir);*/
		log.info("OK!");
	}
}
