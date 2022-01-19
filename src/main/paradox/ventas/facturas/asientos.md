#Asientos

La finalización de la factura genera un asiento contable. El asiento
contable se genera en el periodo lectivo que corresponde a la fecha de la factura.
Los detalles del asiento se generan de la siguiente manera:

- Un detalle Debe por cada pago medio de pago, con el monto del pago y la cuenta configurada para el
  medio de pago en la caja. Si es factura a crédito, se utiliza la cuenta débito configurada para el cliente de la factura.
- Un detalle Haber para cada item, con el monto del item y la cuenta ingreso configurada para el
  para el producto que corresponde al item.

Para visualizar el asiento generado, clic en la pestaña Asientos, que aparece cuando
la factura está en estado Emitido.