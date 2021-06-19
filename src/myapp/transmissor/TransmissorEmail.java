package myapp.transmissor;

import java.util.Date;

public class TransmissorEmail extends TransmissorMensagem {
    String título;


    public String getTítulo() {
        return this.título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }
    
    public TransmissorEmail(Date data) {
		super(data);
	}
    

    @Override
    public void enviar(String mensagem) {
        
    
    }

    
}
