package com.apostila.demo.testes;

import com.apostila.demo.model.ProdutoDAO;

public class ProdutoExcluir {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.excluir(1));

	}

}
