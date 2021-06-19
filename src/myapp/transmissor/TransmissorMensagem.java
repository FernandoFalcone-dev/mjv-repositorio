package myapp.transmissor;

import java.util.Date;

public abstract class TransmissorMensagem {
    private Date data;

    public TransmissorMensagem(Date data){
        this.data = data;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public abstract void enviar (String mensagem);

}
