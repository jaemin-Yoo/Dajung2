package com.example.googlemapexample;

        import com.android.volley.AuthFailureError;
        import com.android.volley.Response;
        import com.android.volley.toolbox.StringRequest;

        import java.util.HashMap;
        import java.util.Map;

public class DestroyRequest extends StringRequest {

    // 서버 URL 설정 (php 파일 연동)
    final static private String URL = "http://3.34.4.41/destroy.php"; // 우리 서버 주소
    private Map<String, String> map;

    public DestroyRequest(String PhoneNum, Response.Listener<String> listener){ // POST 형식으로 응답 보내기
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("PhoneNum", PhoneNum);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
