# Configuración Contable

Cada producto del sistema debe tener una configuración contable. Es decir, a cada producto se le deben asignar las
cuentas contables requeridas para su utilización en el sistema. El sistema requiere que los productos estén configurados
con sus cuentas, para poder generar asientos en operaciones cómo

* Venta de productos en factura de venta.
* Compra de productos en factura de compra.

La configuración contable de cada producto depende de su Tipo de Producto:

* Un producto de tipo Concepto. Ej. Matrícula o Cuota. Se va a utlizar sólo para la venta. Entonces puede requerir:
    - Cuenta de Ingreso. Se utiliza para generar asiento de venta.

* Un producto de tipo Mercadería, Ej. Libro o Remera. Se puede utilizar tanto para compra y venta. Entonces puede
  requerir:
    - Cuenta de Activo. Que se utliza para generar asiento de compra.
    - Cuenta de Ingreso. Que se utiliza para generar asiento de venta. -Cuenta de Egreso. Que se utiliza para el costo
      en asiento de venta.

* Un producto de tipo Servicio. Ej Consultoría o Soporte Técnico. Se puede utilizar tanto para compra y venta. Entonces
  puede requerir:
    - Cuenta de Ingreso. Que se utiliza para la venta.
    - Cuenta de Egreso. Qué se utiliza para la compra.

* Un producto de tipo Esquema. No requiere configuración contable, ya que no se vende directamente. Pero sí, sus
  conceptos que lo conforman, deben estar correctamente configurados.