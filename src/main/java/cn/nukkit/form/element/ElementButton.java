package cn.nukkit.form.element;

public class ElementButton {

    private String text = "";
    public Runnable task = null;
    private ElementButtonImageData image;

    public ElementButton(String text) {
        this.text = text;
    }

    public ElementButton(String text, Runnable task) {
        this.text = text;
        this.task = task;
    }

    public ElementButton(String text, ElementButtonImageData image) {
        this.text = text;
        if (!image.getData().isEmpty() && !image.getType().isEmpty()) this.image = image;
    }

    public void runTask() {
        if (this.task == null) return;
        this.task.run();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ElementButtonImageData getImage() {
        return image;
    }

    public void addImage(ElementButtonImageData image) {
        if (!image.getData().isEmpty() && !image.getType().isEmpty()) this.image = image;
    }

}
