package travelu.travelu_backend.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class InvoicePembayaranDTO {

    private Long noInvoice;

    @NotNull
    @Size(max = 255)
    private String ticketCode;

    @NotNull
    private Integer status;

    @NotNull
    private Double harga;

}
