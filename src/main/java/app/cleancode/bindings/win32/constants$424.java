// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$424 {

    static final FunctionDescriptor CryptRegisterDefaultOIDFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptRegisterDefaultOIDFunction$MH = RuntimeHelper.downcallHandle(
        "CryptRegisterDefaultOIDFunction",
        constants$424.CryptRegisterDefaultOIDFunction$FUNC
    );
    static final FunctionDescriptor CryptUnregisterDefaultOIDFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUnregisterDefaultOIDFunction$MH = RuntimeHelper.downcallHandle(
        "CryptUnregisterDefaultOIDFunction",
        constants$424.CryptUnregisterDefaultOIDFunction$FUNC
    );
    static final FunctionDescriptor CryptSetOIDFunctionValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetOIDFunctionValue$MH = RuntimeHelper.downcallHandle(
        "CryptSetOIDFunctionValue",
        constants$424.CryptSetOIDFunctionValue$FUNC
    );
    static final FunctionDescriptor CryptGetOIDFunctionValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetOIDFunctionValue$MH = RuntimeHelper.downcallHandle(
        "CryptGetOIDFunctionValue",
        constants$424.CryptGetOIDFunctionValue$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_ENUM_OID_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ENUM_OID_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$424.PFN_CRYPT_ENUM_OID_FUNC$FUNC
    );
}


