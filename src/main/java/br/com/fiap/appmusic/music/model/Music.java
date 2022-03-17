package br.com.fiap.appmusic.music.model;

public class Music {
	
	private String nome;
	private String album;
	private String artistas;
	private String genero;
	private String biografia;
	private String dataLancamento;
	private int duracao;
	
	public Music(String nome, String album, String artistas, String genero, String biografia, String dataLancamento, int duracao) {
		super();
		this.nome = nome;
		this.album = album;
		this.artistas = artistas;
		this.genero = genero;
		this.biografia = biografia;
		this.duracao = duracao;
		this.dataLancamento = dataLancamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtistas() {
		return artistas;
	}
	public void setArtistas(String artistas) {
		this.artistas = artistas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
}
