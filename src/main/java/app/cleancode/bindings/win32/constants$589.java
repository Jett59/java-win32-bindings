// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$589 {

    static final FunctionDescriptor PFN_CERT_STORE_PROV_SET_CRL_PROPERTY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_SET_CRL_PROPERTY$MH = RuntimeHelper.downcallHandle(
        constants$589.PFN_CERT_STORE_PROV_SET_CRL_PROPERTY$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_READ_CTL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_READ_CTL$MH = RuntimeHelper.downcallHandle(
        constants$589.PFN_CERT_STORE_PROV_READ_CTL$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_WRITE_CTL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_WRITE_CTL$MH = RuntimeHelper.downcallHandle(
        constants$589.PFN_CERT_STORE_PROV_WRITE_CTL$FUNC
    );
}


