/*
Exercício
Implementar uma classe Java que represente outro
componente de um Carro, similar ao que foi feito com a
máquina de vidro elétrico.
○ Defina pelo menos três atributos, o construtor, os
métodos get e set, e alguma outra operação que este
componente executa em um carro.
○ Publicar o código desenvolvido no GitHub, conforme
demonstrado em aula.

*/

class Carro	{
    String	cor;
    String	modelo;
    double	velocidadeAtual;
    double	velocidadeMaxima;

    //liga	o	carro
    void	liga() {
        System.out.println("O	carro	está	ligado");
    }

    //acelera	uma	certa	quantidade
    void	acelera(double	quantidade) {
        double	velocidadeNova	=	this.velocidadeAtual	+	quantidade;	
        this.velocidadeAtual	=	velocidadeNova;
    }

    //devolve	a	marcha	do	carro
    int	pegaMarcha() {
        if	(this.velocidadeAtual	<	0)	{
             return	-1;
            }
        if	(this.velocidadeAtual	>=	0	&&	this.velocidadeAtual	<	40)	{
             return	1;
        }
        if	(this.velocidadeAtual	>=	40	&&	this.velocidadeAtual	<	80)	{
            return	2;
        }
        return	3;
    }
}

class TestaCarro	{
    public	static	void	main(String[]	args) {
        Carro	meuCarro;
        meuCarro	=	new	Carro();
        meuCarro.cor	=	"Verde";
        meuCarro.modelo	=	"Fusca";
        meuCarro.velocidadeAtual	=	0;
        meuCarro.velocidadeMaxima	=	80;
        //	liga	o	carro
        meuCarro.liga();
        //	acelera	o	carro
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);
    }
}
