package com.AngeloAzcorra.android.model;

public class Pregunta {
    private int mIdResTexto;
    private boolean mRespuestaVerdadera;

    public Pregunta(int idResTexto, boolean respuestaVerdadera) {
        mIdResTexto = idResTexto;
        mRespuestaVerdadera = respuestaVerdadera;
    }

    public int getIdResTexto() {
        return mIdResTexto;
    }

    public void setIdResTexto(int mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean isRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setRespuestaVerdadera(boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }
}
