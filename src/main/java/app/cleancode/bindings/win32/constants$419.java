// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$419 {

    static final FunctionDescriptor CryptEnumProviderTypesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProviderTypesW$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProviderTypesW",
        constants$419.CryptEnumProviderTypesW$FUNC
    );
    static final FunctionDescriptor CryptEnumProvidersA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProvidersA$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProvidersA",
        constants$419.CryptEnumProvidersA$FUNC
    );
    static final FunctionDescriptor CryptEnumProvidersW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProvidersW$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProvidersW",
        constants$419.CryptEnumProvidersW$FUNC
    );
    static final FunctionDescriptor CryptContextAddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptContextAddRef$MH = RuntimeHelper.downcallHandle(
        "CryptContextAddRef",
        constants$419.CryptContextAddRef$FUNC
    );
    static final FunctionDescriptor CryptDuplicateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDuplicateKey$MH = RuntimeHelper.downcallHandle(
        "CryptDuplicateKey",
        constants$419.CryptDuplicateKey$FUNC
    );
    static final FunctionDescriptor CryptDuplicateHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDuplicateHash$MH = RuntimeHelper.downcallHandle(
        "CryptDuplicateHash",
        constants$419.CryptDuplicateHash$FUNC
    );
}

