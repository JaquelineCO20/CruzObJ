# INTERFACES LISTENER Y SUS M脡TODOS EN JAVA 馃捇鉁旓笍
En Java una interface es una clase abstracta pura, es decir una clase d贸nde todos los m茅todos son abstractos猬囷笍

* INTERFACE : **ActionListener** ; La interfaz de escucha para recibir eventos de acci贸n.  
METODO : **actionPerformed** (ActionEvent)

* INTERFACE : **AdjustmentListener** ; La interfaz de escucha para recibir eventos de ajuste.  
METODO : **adjustmentValueChanged** (AdjustmentEvent)

* INTERFACE: **ComponentListener** ; La interfaz de escucha para recibir eventos de componentes.  
METODO : 
**componentHidden** (ComponentEvent)
**componentMoved** (ComponentEvent)
**componentResized** (ComponentEvent)
**componentShown** (ComponentEvent)

* INTERFACE : **ContainerListener** ; La interfaz de escucha para recibir eventos de contenedores.  
METODO : **ComponentAdded** (ComponentEvent)
**ComponentRemoved** (ComponentEvent)

* INTERFACE : **FocusListener** ; La interfaz de escucha para recibir eventos de teclado se centran en un componente.  
METODO : **focusGained** (FocusEvent)  
**focusLost** (FocusEvent)

* INTERFACE : **ItemListener** ; La interfaz de escucha para recibir eventos de elemento.  
METODO : **itemStateChanged** (ItemEvent)

* INTERFACE : **KeyListener** ; La interfaz de escucha para recibir eventos de teclado (combinaciones de teclas).  
METODO : **keyPressed** (KeyEvent)  
**keyReleased** (KeyEvent)  
**keyTyped** (KeyEvent)  

* INTERFACE : **MouseListener** ; La interfaz de receptor para la recepci贸n de "interesantes" eventos del rat贸n en un componente.  
METODO : **mouseClicked** (MouseEvent)  
**mouseEntered** (MouseEvent)  
**mouseExited** (MouseEvent)  
**mousePressed** (MouseEvent)  
**mouseReleased** (MouseEvent)

* INTERFACE : **MouseMotionListener** ; La interfaz de escucha para recibir eventos de rat贸n en movimiento en un componente.  
METODO : **mouseDragged** (MouseEvent)  
**mouseMoved** (MouseEvent)

* INTERFACE : **Texto**: Oyente  
METODO : **textValueChanged** (TextEvent)

* INTERFACE : **WindowListener** ; La interfaz de escucha para recibir eventos de ventana.  
METODO : **windowActivated** (WindowEvent)  
**windowClosed** (WindowEvent)  
**windowClosing** (WindowEvent)  
**windowDeactivated** (WindowEvent)  
**windowDeiconified** (WindowEvent)  
**windowIconified** (WindowEvent)  
**windowOpened** (WindowEvent)

