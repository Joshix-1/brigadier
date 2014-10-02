package net.minecraft.commands.exceptions;

import java.util.Map;

public class CommandException extends Exception {
    private final CommandExceptionType type;
    private final Map<String, Object> data;

    public CommandException(CommandExceptionType type, Map<String, Object> data) {
        this.type = type;
        this.data = data;
    }

    @Override
    public String getMessage() {
        return type.getErrorMessage(this);
    }

    public CommandExceptionType getType() {
        return type;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
