// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$587 {

    static final FunctionDescriptor PFN_CERT_STORE_PROV_WRITE_CERT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_WRITE_CERT$MH = RuntimeHelper.downcallHandle(
        constants$587.PFN_CERT_STORE_PROV_WRITE_CERT$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_DELETE_CERT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_DELETE_CERT$MH = RuntimeHelper.downcallHandle(
        constants$587.PFN_CERT_STORE_PROV_DELETE_CERT$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$MH = RuntimeHelper.downcallHandle(
        constants$587.PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$FUNC
    );
}


