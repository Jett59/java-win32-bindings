// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$414 {

    static final FunctionDescriptor CryptGenKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGenKey$MH = RuntimeHelper.downcallHandle(
        "CryptGenKey",
        constants$414.CryptGenKey$FUNC
    );
    static final FunctionDescriptor CryptDeriveKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDeriveKey$MH = RuntimeHelper.downcallHandle(
        "CryptDeriveKey",
        constants$414.CryptDeriveKey$FUNC
    );
    static final FunctionDescriptor CryptDestroyKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CryptDestroyKey$MH = RuntimeHelper.downcallHandle(
        "CryptDestroyKey",
        constants$414.CryptDestroyKey$FUNC
    );
    static final FunctionDescriptor CryptSetKeyParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetKeyParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetKeyParam",
        constants$414.CryptSetKeyParam$FUNC
    );
    static final FunctionDescriptor CryptGetKeyParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetKeyParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetKeyParam",
        constants$414.CryptGetKeyParam$FUNC
    );
    static final FunctionDescriptor CryptSetHashParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetHashParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetHashParam",
        constants$414.CryptSetHashParam$FUNC
    );
}

