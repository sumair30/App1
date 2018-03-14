package git_hub_sumair_app1.beans;

import java.io.Serializable;

public class WelcomeBean implements Serializable {

	private static final long serialVersionUID = 19908259546000001L;
	
	private final String id;
    private final String content;

    public WelcomeBean(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
