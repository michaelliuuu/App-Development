//
//  GreenBackground.swift
//  GasTrack
//
//  Created by Michael Liu on 2022-12-23.
//

import SwiftUI

struct GreenBackground: View {
    var body: some View {
        Image("green")
            .resizable()
            .frame(height: 150.0)
    }
}

struct GreenBackground_Previews: PreviewProvider {
    static var previews: some View {
        GreenBackground()
    }
}
