package Controller;

import Model.Post;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class PostItem extends ListCell<Post> {
    @Override
    protected void updateItem(Post post, boolean empty) {
        super.updateItem(post, empty);
        if (post != null) {
            try {
                setGraphic(new PostItemController(post).init());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            setGraphic(null);
        }
    }
}
