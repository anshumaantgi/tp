package seedu.internship.logic.parser;

import static seedu.internship.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.internship.commons.core.index.Index;
import seedu.internship.logic.commands.SelectCommand;
import seedu.internship.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new ViewCommand object
 */
public class SelectCommandParser implements Parser<SelectCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the ViewCommand
     * and returns a ViewCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public SelectCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new SelectCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SelectCommand.MESSAGE_USAGE), pe);
        }
    }

}
