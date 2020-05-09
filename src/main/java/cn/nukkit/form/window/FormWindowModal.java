package cn.nukkit.form.window;

import cn.nukkit.form.response.FormResponseModal;

public class FormWindowModal extends FormWindow {

    private final String type = "modal"; //This variable is used for JSON import operations. Do NOT delete :) -- @Snake1999
    private String title = "";
    private String content = "";
    private String button1 = "";
    private String button2 = "";
    private Runnable trueTask = null;
    private Runnable falseTask = null;

    private FormResponseModal response = null;

    public FormWindowModal(String title, String content, String trueButtonText, String falseButtonText) {
        this.title = title;
        this.content = content;
        this.button1 = trueButtonText;
        this.button2 = falseButtonText;
    }

    public void runTask(Boolean bool) {
        if (bool) {
            if (this.trueTask == null) return;
            this.trueTask.run();
        }else {
            if (this.falseTask == null) return;
            this.falseTask.run();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getButton1() {
        return button1;
    }

    public void setButton1(String button1) {
        this.button1 = button1;
    }

    public void setButton1(String button1, Runnable task) {
        this.button1 = button1;
        this.trueTask = task;
    }

    public String getButton2() {
        return button2;
    }

    public void setButton2(String button2) {
        this.button2 = button2;
    }

    public void setButton2(String button2, Runnable task) {
        this.button2 = button2;
        this.falseTask = task;
    }

    public FormResponseModal getResponse() {
        return response;
    }

    public void setResponse(String data) {
        if (data.equals("null")) {
            closed = true;
            return;
        }
        if (data.equals("true")) response = new FormResponseModal(0, button1);
        else response = new FormResponseModal(1, button2);
    }

}
