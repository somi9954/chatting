package org.project.models.chat;

import org.project.commons.CommonException;
import org.springframework.http.HttpStatus;

public class RoomnotFoundException extends CommonException {

    public RoomnotFoundException() {
        super(errors.getString("NotFound.room"), HttpStatus.NOT_FOUND);
    }
}
