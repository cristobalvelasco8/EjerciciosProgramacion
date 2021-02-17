package tresenrayas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Cuadro {
	private int xEnTablero, yEnTablero;
	private int esquinaSuperiorIzquierdaX;
	private int esquinaSuperiorIzquierdaY;
	private int ancho, alto;
	private int jugadorPropietario = 0;
	private int matrizJugadas[][]= new int[][] {{0,0,0},
			                                   {0,0,0},
			                                   {0,0,0}};
	
	
	public Cuadro(int xEnTablero, int yEnTablero)  {
		super();
		this.xEnTablero = xEnTablero;
		this.yEnTablero = yEnTablero;
		
	}
	
	public void paint(Graphics g) {
		ancho = Tresenraya.getInstance().getWidth() / 3;
		alto = Tresenraya.getInstance().getHeight() / 3;
		esquinaSuperiorIzquierdaX = this.xEnTablero * ancho;
		esquinaSuperiorIzquierdaY = this.yEnTablero * alto;
		
		//Pinto el borde
		g.setColor(Color.BLACK);
		g.drawRect(esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY, ancho, alto );
		
		
			//pintaImagenesVectoriales(g);
			pintaImagenesJuego(g);
		
	}
	
	
	private void pintaImagenesVectoriales(Graphics g) {
		if (this.jugadorPropietario == Tresenraya.JUGADOR_1) {
			g.drawLine(this.esquinaSuperiorIzquierdaX,this.esquinaSuperiorIzquierdaY, this.esquinaSuperiorIzquierdaX + ancho, this.esquinaSuperiorIzquierdaY + alto);
			g.drawLine(this.esquinaSuperiorIzquierdaX,this.esquinaSuperiorIzquierdaY + alto, this.esquinaSuperiorIzquierdaX + ancho, this.esquinaSuperiorIzquierdaY);
		}
		if (this.jugadorPropietario == Tresenraya.JUGADOR_2) {
			g.drawOval(this.esquinaSuperiorIzquierdaX,this.esquinaSuperiorIzquierdaY,ancho,alto);
		}
	}
	
	private void pintaImagenesJuego(Graphics g) {
        BufferedImage imagenAPintar = null;
        if (this.jugadorPropietario == Tresenraya.JUGADOR_1) {
            imagenAPintar = ResourcesCache.getInstance().getImagen("betis.png.png");
        }
        if (this.jugadorPropietario == Tresenraya.JUGADOR_2) {
            imagenAPintar = ResourcesCache.getInstance().getImagen("sevilla.png.png");
        }
        if(imagenAPintar != null) {
            int x = this.esquinaSuperiorIzquierdaX + this.ancho / 2 - imagenAPintar.getWidth() / 2;
            int y = this.esquinaSuperiorIzquierdaY + this.alto / 2 - imagenAPintar.getHeight() / 2;
            g.drawImage(imagenAPintar, x, y, null);
        }
    }
	
	public boolean SehahechoclicSobreCuadro (int xClic, int yClic) {
		if (xClic > this.esquinaSuperiorIzquierdaX && xClic < (esquinaSuperiorIzquierdaX + ancho) &&
		   yClic > this.esquinaSuperiorIzquierdaY && yClic < (esquinaSuperiorIzquierdaY + alto)) {
	return true;
		   }
	return false;
}
	public void clic (int jugador) {
		if (this.jugadorPropietario ==0) {
			this.jugadorPropietario = jugador;
			
			Tresenraya.getInstance().getMatrizJugadas()[this.yEnTablero][this.xEnTablero] = jugador;
		}
		Tresenraya.getInstance().repaint();
		Tresenraya.getInstance().revalidate();
		
		System.out.println("Jugada");
        for ( int i = 0; i < Tresenraya.getInstance().getMatrizJugadas().length;i++) {
            for (int j = 0; j < Tresenraya.getInstance().getMatrizJugadas()[i].length;j++) {
                System.out.print(Tresenraya.getInstance().getMatrizJugadas()[i][j] + "\t");
            }
            System.out.println();
        }
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cuadro [xEnTablero=" + xEnTablero + ", yEnTablero=" + yEnTablero + "]";
		
		
	}

	public int getxEnTablero() {
		return xEnTablero;
	}

	public void setxEnTablero(int xEnTablero) {
		this.xEnTablero = xEnTablero;
	}

	public int getyEnTablero() {
		return yEnTablero;
	}

	public void setyEnTablero(int yEnTablero) {
		this.yEnTablero = yEnTablero;
	}
	
	
	
	
	

}

