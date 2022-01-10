package model;

import lombok.Data;
import lombok.Getter;

import java.io.IOException;
@Getter
public class DeleteFile implements AbstractMessage{



    private  String fileName;

    public DeleteFile(String fileName) {
        this.fileName = fileName;
    }



//    public String getFileName() {
//        return fileName;
//    }

    @Override
    public MessageType getMessageType() {

        return MessageType.FILE_DELETE;
    }

}
