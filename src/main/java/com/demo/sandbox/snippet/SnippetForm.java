package com.demo.sandbox.snippet;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class to display frontend model which will display attributes.
 */

@Getter
@Setter
@Data
@NoArgsConstructor
public class SnippetForm {
	private Long id;
	private String keyword = "";	// keywords to search
	private String title = "";		// title of Snippet
	private String category = "";	// category
	private String content = "";	// content to be stored
	List<Snippet> snippetsList;		// list of existing snippets
	List<String> categoryList;		// current list of categories
}
