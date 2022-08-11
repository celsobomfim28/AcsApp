package br.com.acs.Utils;

import br.com.acs.errors.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    public static LocalDate toLocalDate(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(data, formatter);
        return localDate;
    }

    public static String toString(LocalDate data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String formattedString = data.format(formatter);
        return formattedString;
    }

    public static String getDataHoraAtual() {
        return LocalDateTime.now().toString();
    }

   /* public static ErrorResponse getError(ResponseStatusException e){
        ErrorResponse errorResponse;
        if(e.getStatus() == HttpStatus.BAD_REQUEST){
            errorResponse = new ErrorResponse("Erro Interno!",
                    400, "O caminho solicitado é incorreto",
                    e.getReason(), HttpStatus.BAD_REQUEST);
            return errorResponse;
        }
        if(e.getStatus() == HttpStatus.UNAUTHORIZED){
            errorResponse = new ErrorResponse("Você não tem autorização para esse recurso!",
                    403, "Acesso Negado!",
                    e.getReason(), HttpStatus.UNAUTHORIZED);
            return errorResponse;
        }
        if(e.getStatus() == HttpStatus.NOT_FOUND){
            errorResponse = new ErrorResponse("O Recurso não pode ser encontrado!",
                    404, "Recurso não encontrado!",
                    e.getReason(), HttpStatus.NOT_FOUND);
            return errorResponse;
        }
        if(e.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR){
            errorResponse = new ErrorResponse("Erro de servidor, contate o desenvolvedor!",
                    404, "Erro interno de servidor!",
                    e.getReason(), HttpStatus.INTERNAL_SERVER_ERROR);
            return errorResponse;
        }
        errorResponse = new ErrorResponse("Erro desconhecido, contate o desenvolvedor!",
                000, "Erro interno de servidor!",
                e.getReason(), HttpStatus.FORBIDDEN);
        return errorResponse;
    }*/
}
