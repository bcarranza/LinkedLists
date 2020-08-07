/**
 * @author BC
 * @version 1.0
 * Manage simple linked list
 */
public class SimpleList
{
    /**
     * first node on the list (head)
     */
    SimpleNode beginNode;

    /**
     * Constructor 
     */
    public SimpleList()
    {
        beginNode=null;
    }

    /**
     * Return true if list is empty
     */
    public boolean isEmpty()
    {
        if(beginNode==null){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Get a number elements of the list.
     */
    public int getLength()
    {
        if(beginNode==null){
            return 0;
        }
        else{
            return LengthCounter(this.beginNode,0);
        }
    }
    
    /**
     * Internal recursive method for drill down into the list.
     */
    private int LengthCounter(SimpleNode node, int i)
    {
        i++;
        if(node.getNextNode()!=null){
            return LengthCounter(node.getNextNode(),i);
        }
        return i;    
    }

    public void addEnd(int x){
        
        SimpleNode sn= new SimpleNode();
        sn.setValue(x);
        
        if(isEmpty()){
            this.beginNode=sn;
        }
        else{
            //while hasta que nextNode is null
            SimpleNode aux=beginNode;
            while(aux.getNextNode()!=null)
            {
                aux=aux.getNextNode();
            }
            //final node
            aux.setNextNode(sn);
        }
    }

    public void addBegin(int x){
        
        SimpleNode sn= new SimpleNode();
        sn.setValue(x);
        
        if(isEmpty()){
            this.beginNode=sn;
        }
        else{
            SimpleNode aux=beginNode;
            this.beginNode=sn;
            sn.setNextNode(aux);
        }
    }

    public void print(){
        int x=1;
        if(!isEmpty()){
            SimpleNode sn=beginNode;
            System.out.println("Nodo " + x + " " + sn.getValue());
            while(sn.getNextNode()!=null)
            {
                x++;
                sn=sn.getNextNode();
                System.out.println("Nodo " + x + " " + sn.getValue());
            }
        }
        else{
            System.out.println("La lista se encuentra vacia.");
        }   
    }
}

/*
agregarAlFinal
agregarAlInicio
insertarPorReferencia
insrtarPorPosicion
getValor
buscar
getposicion
editarPorReferencia
editarPorPosicion
removerPorReferencia
removerPorPosicion
eliminar lista
imprimir
ordenar.
*/