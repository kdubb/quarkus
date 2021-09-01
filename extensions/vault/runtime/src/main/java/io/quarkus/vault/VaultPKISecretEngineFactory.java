package io.quarkus.vault;

import io.quarkus.vault.pki.EnableEngineOptions;

/**
 * Allows obtaining PKI engines for specific mount paths.
 *
 * @see VaultPKISecretEngine
 */
public interface VaultPKISecretEngineFactory {

    /**
     * Get a PKI engine for a specific mount.
     *
     * @param mount Engine mount path.
     *
     * @return PKI engine interface.
     */
    VaultPKISecretEngine engine(String mount);

    /**
     * Enables the engine at a specific mount.
     *
     * @param mount Engine mount path.
     * @param description Human friendly description of mount point.
     * @param options Engine options.
     */
    void enable(String mount, String description, EnableEngineOptions options);

    /**
     * Disables the engine at a specific mount.
     *
     * @param mount Engine mount path.
     */
    void disable(String mount);

}
