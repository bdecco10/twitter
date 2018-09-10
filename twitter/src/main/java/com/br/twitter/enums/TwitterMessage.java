package com.br.twitter.enums;

public enum TwitterMessage {
	
	ERROR_SAVE("Favor preencher a informação de #Tag"),
	ERROR_RETRIEVE_HOUR("Favor preencher a informação de data corretamente: Padrão (HH:mm:ss)");
 
    private String descricao;
 
    TwitterMessage(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
