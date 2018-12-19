//application_image_repository = "aleckeller13"
//application_image_repository_credential = "dockerhub-creds"

libraries{
  merge = true
  github_enterprise
  docker
  marketplace
  //ucp
}

keywords{
  override = true
  master  =  /^[Mm]aster$/
  develop =  /^[Dd]evelop(ment|er|)$/
  hotfix  =  /^[Hh]ot[Ff]ix-/
  release =  /^[Rr]elease-(\d+.)*\d$/
}

application_environments{
  override = true
  dev{
     short_name = "dev"
     long_name = "Development"
  }
  test{
     short_name = "test"
     long_name = "Test"
  }
  staging{
     short_name = "stage"
     long_name = "Staging"
  }
  prod{
     short_name = "prod"
     long_name = "Production"
  }
}
