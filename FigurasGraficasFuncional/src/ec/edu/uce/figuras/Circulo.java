package ec.edu.uce.figuras;

import org.lwjgl.opengl.GL11;

public class Circulo extends VentanaFigura {
    public static void main(String[] args) {
        new Circulo().ejecutar(() -> {
            GL11.glBegin(GL11.GL_TRIANGLE_FAN);
            GL11.glColor3f(1.0f, 0.0f, 0.0f); // Rojo

            float centerX = 0.0f;
            float centerY = 0.0f;
            float radius = 0.5f;
            int numTriangles = 50;

            GL11.glVertex2f(centerX, centerY);
            for (int i = 0; i <= numTriangles; i++) {
                float theta = (float) (2.0f * Math.PI * i / numTriangles);
                float x = (float) (radius * Math.cos(theta));
                float y = (float) (radius * Math.sin(theta));
                GL11.glVertex2f(centerX + x, centerY + y);
            }
            GL11.glEnd();
        });
    }
}

