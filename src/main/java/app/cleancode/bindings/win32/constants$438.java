// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$438 {

    static final FunctionDescriptor PFN_CERT_STORE_PROV_DELETE_CTL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_DELETE_CTL$MH = RuntimeHelper.downcallHandle(
        constants$438.PFN_CERT_STORE_PROV_DELETE_CTL$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_SET_CTL_PROPERTY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_SET_CTL_PROPERTY$MH = RuntimeHelper.downcallHandle(
        constants$438.PFN_CERT_STORE_PROV_SET_CTL_PROPERTY$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_CONTROL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_CONTROL$MH = RuntimeHelper.downcallHandle(
        constants$438.PFN_CERT_STORE_PROV_CONTROL$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FIND_CERT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


