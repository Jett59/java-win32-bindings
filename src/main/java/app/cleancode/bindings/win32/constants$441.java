// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$441 {

    static final FunctionDescriptor PFN_CERT_STORE_PROV_FIND_CTL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_FIND_CTL$MH = RuntimeHelper.downcallHandle(
        constants$441.PFN_CERT_STORE_PROV_FIND_CTL$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_FREE_FIND_CTL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_FREE_FIND_CTL$MH = RuntimeHelper.downcallHandle(
        constants$441.PFN_CERT_STORE_PROV_FREE_FIND_CTL$FUNC
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$MH = RuntimeHelper.downcallHandle(
        constants$441.PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$FUNC
    );
    static final FunctionDescriptor CertDuplicateStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateStore$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateStore",
        constants$441.CertDuplicateStore$FUNC
    );
}

