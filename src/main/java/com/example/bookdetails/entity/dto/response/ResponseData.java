package com.example.bookdetails.entity.dto.response;

import com.example.bookdetails.util.constants.CodeResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseData {
    private int code;
    private AbstractResponse data;
    private String message;

    public ResponseData(CodeResponse codeResponse) {
        this.code = codeResponse.getCode();
        this.message = codeResponse.getMessage();
    }

    public ResponseData(AbstractResponse data) {
        this.code = CodeResponse.SUCCESS_CODE.getCode();
        this.message = CodeResponse.SUCCESS_CODE.getMessage();
        this.data = data;
    }
    public ResponseData() {
        this.code = CodeResponse.SUCCESS_CODE.getCode();
        this.message = CodeResponse.SUCCESS_CODE.getMessage();
    }

    public ResponseData(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
