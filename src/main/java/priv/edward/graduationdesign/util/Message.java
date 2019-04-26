package priv.edward.graduationdesign.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Message implements Serializable {
    //状态码 1-成功  0-失败
    private int code;
    //提示信息
    private String msg;
    //用户返回给浏览器的数据
    private Map<String, Object> data = new HashMap<String,Object>();

    public static Message success(){
        Message result = new Message();
        result.setCode(1);
        result.setMsg("success");
        return result;
    }

    public static Message fail(){
        Message result = new Message();
        result.setCode(0);
        result.setMsg("fail");
        return result;
    }

    public Message add(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> extend) {
        this.data = extend;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
