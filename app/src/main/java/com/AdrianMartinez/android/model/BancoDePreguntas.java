package com.AngeloAzcorra.android.model;

import java.util.ArrayList;
import java.util.List;

public class BancoDePreguntas {
    private List<Pregunta> mBanco;
    private int mPosionActual;

    public BancoDePreguntas(){
        mBanco=new ArrayList<>();
        mPosionActual=-1;
    }

    public void add(Pregunta pregunta){
        mBanco.add(pregunta);
        if(size()==1){
            mPosionActual=0;
        }
    }
    public int size(){
        return mBanco.size();
    }
    public boolean isEmpty(){
        return mBanco.isEmpty();
    }
    public Pregunta get(int posicion){
        return mBanco.get(posicion);
    }
    public Pregunta next(){
        if(isEmpty()){
            return null;
        } else {
            if(mPosionActual==size()-1){
                mPosionActual=0;
            }else{
                mPosionActual++;
            }

        }
        return mBanco.get(mPosionActual);
    }
    public Pregunta previous(){
        if(isEmpty()){
            return null;
        }else{
            if(mPosionActual==0){
                mPosionActual=size()-1;
            } else {
                mPosionActual--;
            }
            return mBanco.get(mPosionActual);
        }
    }

}
