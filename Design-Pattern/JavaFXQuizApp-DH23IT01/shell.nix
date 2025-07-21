# shell.nix
{ pkgs ? import <nixpkgs> { config.allowUnfree = true; } }:

let
  # Lấy đúng gói driver NVIDIA (production là bản ổn định)
  nvidiaPackage = pkgs.linuxPackages.nvidia_x11_production;
in
pkgs.mkShell {
  buildInputs = [
    pkgs.openjdk17
    pkgs.openjfx17
    # Thêm gói driver NVIDIA vào môi trường
    nvidiaPackage
  ];

  # Chỉ đường tường minh cho Java đến thư viện của NVIDIA
  shellHook = ''
    export LD_LIBRARY_PATH="${pkgs.lib.makeLibraryPath [ nvidiaPackage ]}:$LD_LIBRARY_PATH"
    echo "Da san sang moi truong JavaFX voi driver NVIDIA."
  '';
}

