package Modelo;

public class Robot {
	private int posX;
	private int posY;
	private int vida;
	private boolean vivo;
	
	public Robot () {
		this.posX=0;
		this.posY=0;
		this.vida=100;
		this.vivo=true;
	}
	
	public void nuevaPos(int nuevaX,int nuevaY) {
		this.posX=this.posX+nuevaX;
		this.posY=this.posY+nuevaY;
	}
	
	public int posicionX() {
		return this.posX;
	}
	
	public int posicionY() {
		return this.posY;
	}
	
	public void dañoRecibido(int daño) {
		this.vida=this.vida-daño;
		this.muerto();
	}
	
	public boolean muerto() {
		if (this.vida<=0) {
			this.vivo=false;
		}
		return this.vivo;
	}
}
