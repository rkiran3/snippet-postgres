package com.demo.sandbox.snippet;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Data
@NoArgsConstructor
public class SnippetForm {
	private Long id;
	private String keyword = "";
	private String title = "";
	private String category = "";
	private String content = "";
	List<Snippet> snippetsList;
	List<String> categoryList;
}
