// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$482 {

    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD$MH = RuntimeHelper.downcallHandle(
        constants$482.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE$MH = RuntimeHelper.downcallHandle(
        constants$482.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER$MH = RuntimeHelper.downcallHandle(
        constants$482.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

